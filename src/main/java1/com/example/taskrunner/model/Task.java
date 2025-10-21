package com.example.taskrunner.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "tasks")
public class Task {
    @Id
    private String id;

    private String name;
    private String owner;
    private String command;

    private List<TaskExecution> taskExecutions = new ArrayList<>();
}