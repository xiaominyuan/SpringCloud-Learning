package com.yxm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("Serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    private String dbSource;

    public Dept(Long deptNo, String dName, String dbSource) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.dbSource = dbSource;
    }
}
