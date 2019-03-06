package com.evgen.timetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evgen.timetable.model.entity.WorkDay;

public interface WorkDayRepository extends JpaRepository<WorkDay, Long> {
}
