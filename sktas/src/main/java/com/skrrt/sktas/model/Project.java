
package com.skrrt.sktas.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name", nullable = false, length = 150)
    private String projectName;

    @Column(name = "description")
    private String description;

    @Column(name = "allocated_budget", nullable = false, precision = 12, scale = 2)
    private BigDecimal allocatedBudget;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

public Project() {
}

public Project(String projectName, String description,
               BigDecimal allocatedBudget, String status) {

    this.projectName = projectName;
    this.description = description;
    this.allocatedBudget = allocatedBudget;
    this.status = status;
}

public Long getProjectId() {
   return projectId;
}

public String getProjectName() {
   return projectName;
}

public void setProjectName(String projectName) {
   this.projectName = projectName;
}

public String getDescription() {
   return description;
}

public void setDescription(String description) {
   this.description = description;
}

public BigDecimal getAllocatedBudget() {
   return allocatedBudget;
}

public void setAllocatedBudget(BigDecimal allocatedBudget) {
   this.allocatedBudget = allocatedBudget;
}

public String getStatus() {
   return status;
}

public void setStatus(String status) {
   this.status = status;
}

public LocalDateTime getCreatedAt() {
   return createdAt;
}

}
