package org.vaadin.crudui;

import java.io.Serializable;

/**
 * @author Alejandro Duarte
 */
public interface CrudListener<T> extends Serializable {

    void add(T domainObjectToAdd);

    void update(T domainObjectToUpdate);

    void delete(T domainObjectToDelete);

}
