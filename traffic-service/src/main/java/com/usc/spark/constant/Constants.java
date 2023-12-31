package com.usc.spark.constant;

/**
 * 常量接口
 *
 * @author Administrator
 *
 */
public interface Constants {
	/**
	 * 项目配置相关的常量
	 */
	public static final String JDBC_DRIVER = "jdbc.driver";
	String JDBC_DATASOURCE_SIZE = "jdbc.datasource.size";
	String JDBC_URL = "jdbc.url";
	String JDBC_USER = "jdbc.user";
	String JDBC_PASSWORD = "jdbc.password";
	String JDBC_URL_PROD = "jdbc.url.prod";
	String JDBC_USER_PROD = "jdbc.user.prod";
	String JDBC_PASSWORD_PROD = "jdbc.password.prod";
	String SPARK_LOCAL = "spark.local";
	String SPARK_LOCAL_TASKID_TripModeAnalyze = "spark.local.taskId.tripModeAnalyze";

	String KAFKA_METADATA_BROKER_LIST = "kafka.metadata.broker.list";
	String KAFKA_TOPICS = "kafka.topics";
	
	/**
	 * Spark作业相关的常量
	 */
	String SPARK_NEAR_STATION_COUNT="stationCount";

	String RedisHost="rediHost";
	String RedisPort="redisPort";
	String ReidsTimeOut="redistimeOut";

	String SPARK_NEAR_CONPARE_STATION_COUNT= "3";
	String FIELD_CAMERA_COUNT = "cameraCount";
	String FIELD_CAMERA_IDS = "cameraIds";
	String FIELD_CAR_COUNT = "carCount";
	String FIELD_NORMAL_MONITOR_COUNT = "normalMonitorCount";
	String FIELD_NORMAL_CAMERA_COUNT = "normalCameraCount";
	String FIELD_ABNORMAL_MONITOR_COUNT = "abnormalMonitorCount";
	String FIELD_ABNORMAL_CAMERA_COUNT = "abnormalCameraCount";
	String FIELD_ABNORMAL_MONITOR_CAMERA_INFOS = "abnormalMonitorCameraInfos";
	String FIELD_TOP_NUM = "topNum";
	String FIELD_DATE_HOUR="dateHour";
	String FIELD_CAR_TRACK="carTrack";
	String FIELD_DATE="dateHour";
	String FIELD_CAR="car";
	String FIELD_CARS="cars";
	String FIELD_MONITOR="monitor";
	String FIELD_MONITOR_ID="monitorId";
	String FIELD_ACTION_TIME="actionTime";
	String FIELD_EXTRACT_NUM = "extractNum";
	//低速行驶
 	String FIELD_SPEED_0_60 = "0_60";
 	//正常行驶
 	String FIELD_SPEED_60_90 = "60_90";
 	//中速行驶
 	String FIELD_SPEED_90_120 = "90_120";
 	//高速行驶
 	String FIELD_SPEED_120_MAX = "120_max";
 	String FIELD_AREA_ID = "areaId";
 	String FIELD_AREA_NAME = "areaName";
	
	
	 
	
	/**
	 * 任务相关的常量
	 */
	String PARAM_START_DATE = "startDate";
	String PARAM_END_DATE = "endDate";
	String PARAM_MONITOR_FLOW = "ROADFLOW";
	
	
}
