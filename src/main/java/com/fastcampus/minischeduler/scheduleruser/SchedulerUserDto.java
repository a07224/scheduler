package com.fastcampus.minischeduler.scheduleruser;

import com.fastcampus.minischeduler.scheduleradmin.SchedulerAdmin;
import com.fastcampus.minischeduler.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SchedulerUserDto {
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private User user;
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private SchedulerAdmin schedulerAdmin;

    private LocalDateTime scheduleStart;
    private Progress progress;
    private LocalDateTime createdAt;

    @Builder
    public SchedulerUserDto(
            User user,
            SchedulerAdmin schedulerAdmin,
            LocalDateTime scheduleStart,
            Progress progress,
            LocalDateTime createdAt
    ){
        this.user = user;
        this.schedulerAdmin = schedulerAdmin;
        this.scheduleStart = scheduleStart;
        this.progress = progress;
        this.createdAt = createdAt;
    }
}