package com.bat.petra.data.repository.validation;

import com.bat.petra.data.service.MappingRulesService;

public class AccountValidator extends ValidatorDefinition {

    protected RulesEntities myentity;
    protected RuleTypes myrulestype;

    public AccountValidator () {

        super();

    }



    @Override
    public void setRule(RuleTypes ruletype, RulesEntities ruleentity) {
        myrulestype = ruletype;
        myentity = ruleentity;

    }

    @Override
    public String getRuleValue(String field, String value) {

        String myqueryvalue = new MappingRulesService().getTargetValue(myentity.toString(), field, value , myentity.toString());
        return myqueryvalue;
    }

}
