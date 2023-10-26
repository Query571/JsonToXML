package com.rk.model.ecl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private String operation;

    private String senderId;

    private int id;

    private List<ManifestECL> data;

}
