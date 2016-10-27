package com.avn.dataload.model;

public class ${table_name} {

<#list columns as col>

    private ${col.type} ${col.name};
    
    public void set${col.name}(${col.type} ${col.name}) {
        this.${col.name} = ${col.name};
    }
    
    public ${col.type} get${col.name}() {
        return this.${col.name};
    }
      
</#list>

    public String toString() {
        StringBuilder result = new StringBuilder();
    <#list columns as col>
        result.append("${col.name}: " + get${col.name}() + "||");
    </#list>
        return result.toString();
    }
    
}