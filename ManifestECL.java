package com.rk.model.ecl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ManifestECL {

    private int id;
    private Integer manifestIEID;
    private Integer eDeliveryOrderID;
    private int eclAmendmentTypeRID;
    private long crn;
    private String filepath;
    private int approvalStatusRID;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean isActive;
    private List<ManifestECLManifest> eclManifestModels;
}
