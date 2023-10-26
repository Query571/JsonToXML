package com.rk.model.ecl;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ManifestECLBillModel {

    private int id;
    private int manifestTypeId;
    private int manifestFileTypeRID;
    private String manifestFilePath;
    private long crn;
    private long manifestNo;
    private LocalDateTime manifestDate;
    private int voyageRID;
    private int loadingDischargePortRID;
    private LocalDateTime dischargeLoadingDate;
    private LocalDateTime eta;
    private LocalDateTime etd;
    private int totalNoOfCrewPassengers;
    private int totalNoOfBill;
    private int totalContainers;
    private String remark;
    private int approvalStatusRID;
    private int cargoTypeRID;
    private String captainNameEnglish;
    private String captainNameArabic;
    private int tankerGrossWeight;
    private int tankerNetWeight;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean isActive;
    private String Vcn;
    private String VesselNameEnglish;
    private String VesselNameArabic;
   /* private List<ECLManifestRoute> eclManifestRoute;
    private List<ECLManifestRecipients> eclManifestRecipients;
    private List<ECLManifestContainer> eclManifestContainer;
    private List<ECLManifestBillModel> eclManifestBillModels;
    private List<ECLManifestAgentModel> eclManifestAgentModels;
    private ECLManifest eclId;*/
}
