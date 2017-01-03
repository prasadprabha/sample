package com.migration.spring.service;

import com.migration.spring.dao.MigrationReportDAO;

public class MigrationReportServiceImpl implements MigrationReportService {

	private MigrationReportDAO migrationReportDAO;

	public MigrationReportDAO getMigrationReportDAO() {
		return migrationReportDAO;
	}

	public void setMigrationReportDAO(MigrationReportDAO migrationReportDAO) {
		this.migrationReportDAO = migrationReportDAO;
	}
	
	
}
