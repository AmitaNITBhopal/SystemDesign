/*
 * package com.systemdesign.BasicLOSOnAzure.entity;
 * 
 * import java.time.LocalDateTime;
 * 
 * import javax.persistence.*;
 * 
 * import org.springframework.data.annotation.CreatedBy; import
 * org.springframework.data.annotation.CreatedDate; import
 * org.springframework.data.annotation.LastModifiedBy; import
 * org.springframework.data.annotation.LastModifiedDate; import
 * org.springframework.data.jpa.domain.support.AuditingEntityListener;
 * 
 * 
 * @MappedSuperclass
 * 
 * @EntityListeners(AuditingEntityListener.class)
 * 
 * public class BaseEntity {
 * 
 * public BaseEntity(String createdBy) { super(); this.createdBy = createdBy;
 * this.createdAt = LocalDateTime.now(); }
 * 
 * public BaseEntity(String createdBy, LocalDateTime updatedAt, String
 * updatedBy) { super(); this.createdBy = createdBy; this.updatedAt = updatedAt;
 * this.updatedBy = updatedBy; this.createdAt = LocalDateTime.now(); }
 * 
 * @CreatedDate //@ColumnResult(name="created_at",updatable = false)
 * 
 * @Column(name="created_at",updatable = false) private LocalDateTime createdAt;
 * 
 * @CreatedBy //@ColumnResult(name="created_by",updatable = false)
 * 
 * @Column(name="created_by",updatable = false) private String createdBy;
 * 
 * @LastModifiedDate
 * 
 * @Column(name="updated_at", insertable = false) private LocalDateTime
 * updatedAt;
 * 
 * @LastModifiedBy
 * 
 * @Column(name="updated_by", insertable = false) private String updatedBy;
 * 
 * public LocalDateTime getCreatedAt() { return createdAt; }
 * 
 * public void setCreatedAt(LocalDateTime createdAt) { this.createdAt =
 * createdAt; }
 * 
 * public String getCreatedBy() { return createdBy; }
 * 
 * public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
 * 
 * public LocalDateTime getUpdatedAt() { return updatedAt; }
 * 
 * public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt =
 * updatedAt; }
 * 
 * public String getUpdatedBy() { return updatedBy; }
 * 
 * public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
 * 
 * @Override public String toString() { return "BaseEntity [createdAt=" +
 * createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt +
 * ", updatedBy=" + updatedBy + "]"; } }
 */