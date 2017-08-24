package com.company.sakila.db0.sakila.country.generated;

import com.company.sakila.db0.sakila.country.Country;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.db0.sakila.country.Country} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCountryManager extends Manager<Country> {
    
    @Override
    default Class<Country> getEntityClass() {
        return Country.class;
    }
}