package sms.service.impl;

import sms.persistence.PersistenceService;

import java.util.Optional;
import java.util.ServiceLoader;

public class PersistenceServiceLoader {
    public   static PersistenceService persistenceService;
    static{
        final Optional<PersistenceService> optionalService = ServiceLoader.load(PersistenceService.class).findFirst();
        if(optionalService.isPresent()){
            persistenceService = optionalService.get();
        }else{
            throw new RuntimeException("No Persistence Service.");
        }
    }
}