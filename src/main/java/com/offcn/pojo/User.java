package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User implements Serializable {

    private String name;
    private String classes;
    private Integer age ;
}
