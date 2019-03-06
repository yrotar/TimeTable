package com.evgen.timetable.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.evgen.timetable.model.entity.TimeTable;
import com.evgen.timetable.model.dto.timeTable.TimeTableResponse;
import com.evgen.timetable.model.dto.timeTable.TimeTableUpdateRequest;

@Mapper(componentModel = "spring", uses = WorkDayMapper.class)
public interface TimeTableMapper {

  @Mapping(target = "timeTableId", source = "id")
  TimeTableResponse timeTableToTimeTableResponse(TimeTable timeTable);

  @Mapping(target = "workDays", ignore = true)
  void mapTimeTableFromTimeTableUpdateRequest(TimeTableUpdateRequest timeTableUpdateRequest,
      @MappingTarget TimeTable timeTable);

}
