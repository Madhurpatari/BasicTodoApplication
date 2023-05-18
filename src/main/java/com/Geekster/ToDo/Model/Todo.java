package com.Geekster.ToDo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private String id;
    private String todoName;
    private boolean todoStatus;

}
