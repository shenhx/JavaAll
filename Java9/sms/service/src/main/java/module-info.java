module sms.service{
    exports sms.service;
    requires sms.model;
    requires sms.persistence;
    uses sms.persistence.PersistenceService;
    // 暴露接口方法
    provides  sms.service.StudentService  with sms.service.impl.StudentServiceImpl;
}