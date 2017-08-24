package com.company.sakila.db0.sakila.store.generated;

import com.company.sakila.db0.sakila.store.Store;
import com.company.sakila.db0.sakila.store.StoreImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.db0.sakila.store.Store} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStoreSqlAdapter {
    
    private final TableIdentifier<Store> tableIdentifier;
    
    protected GeneratedStoreSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "sakila", "store");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Store apply(ResultSet resultSet) throws SpeedmentException {
        final Store entity = createEntity();
        try {
            entity.setStoreId(        resultSet.getShort(1)     );
            entity.setManagerStaffId( resultSet.getShort(2)     );
            entity.setAddressId(      resultSet.getInt(3)       );
            entity.setLastUpdate(     resultSet.getTimestamp(4) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected StoreImpl createEntity() {
        return new StoreImpl();
    }
}