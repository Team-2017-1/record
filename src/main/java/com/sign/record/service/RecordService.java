package com.sign.record.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sign.record.dto.Record;
import com.sign.record.repository.RecordMapper;


@Service
public class RecordService {
	
	@Autowired
	private RecordMapper recordMapper;

	public int insert(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.insert(record);
	}
	
	/**
     * 总正常上班固定工时：fixedhoursSum
     * */
	public int fixedhoursSum() {
		// TODO Auto-generated method stub
		return recordMapper.fixedhoursSum();
	}
    /**
     * 总正常上班实际工时：actualhoursSum
     * */
	public int actualhoursSum() {
		// TODO Auto-generated method stub
		return recordMapper.actualhoursSum();
	}
    /**
     * 总工作日请假固定工时：leaveSum
     * */
	public int leaveSum() {
		// TODO Auto-generated method stub
		return recordMapper.leaveSum();
	}
	/**
     * 总实际加班工时：overSum
     * */
	public int overSum() {
		// TODO Auto-generated method stub
		return recordMapper.overSum();
	}

}
