package com.bat.petra.data.repository.validation;

import com.bat.petra.data.service.MappingRulesService;

public class ProductValidator extends ValidatorDefinition {

    protected RulesEntities myentity;
    protected RuleTypes myrulestype;

    public ProductValidator() {

        super();

    }

    @Override
    public void setRule(RuleTypes ruletype, RulesEntities ruleentity) {
        myrulestype = ruletype;
        myentity = ruleentity;


    }

    @Override
    public String getRuleValue(String field, String value) {

        String myqueryvalue = new MappingRulesService().getTargetValue(myentity.toString(), field, value, myrulestype.toString());
        return myqueryvalue;
    }

}
