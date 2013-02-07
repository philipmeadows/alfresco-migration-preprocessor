package org.alfresco.repo.bulkimport.annotations;

import java.lang.annotation.ElementType;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(ElementType.FIELD)
public @interface NodeAssociation {
  String name();

  String namespace() default "";

  String fieldName();

  String fkPropertyName();

  String fkPropertyType();

}