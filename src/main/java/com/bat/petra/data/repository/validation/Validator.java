package com.bat.petra.data.repository.validation;

public interface Validator {

    void setRule(RuleTypes ruletype, RulesEntities ruleentity);

    String getRuleValue(String field, String value);

}
