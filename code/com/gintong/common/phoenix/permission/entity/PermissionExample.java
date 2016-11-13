package com.gintong.common.phoenix.permission.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(Long value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(Long value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(Long value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(Long value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(Long value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<Long> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<Long> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(Long value1, Long value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(Long value1, Long value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Long value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Long value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Long value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Long value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Long value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Long value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Long> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Long> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Long value1, Long value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Long value1, Long value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Short value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Short value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Short value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Short value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Short value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Short> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Short> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Short value1, Short value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Short value1, Short value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResAccRuleIsNull() {
            addCriterion("res_acc_rule is null");
            return (Criteria) this;
        }

        public Criteria andResAccRuleIsNotNull() {
            addCriterion("res_acc_rule is not null");
            return (Criteria) this;
        }

        public Criteria andResAccRuleEqualTo(String value) {
            addCriterion("res_acc_rule =", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleNotEqualTo(String value) {
            addCriterion("res_acc_rule <>", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleGreaterThan(String value) {
            addCriterion("res_acc_rule >", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleGreaterThanOrEqualTo(String value) {
            addCriterion("res_acc_rule >=", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleLessThan(String value) {
            addCriterion("res_acc_rule <", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleLessThanOrEqualTo(String value) {
            addCriterion("res_acc_rule <=", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleLike(String value) {
            addCriterion("res_acc_rule like", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleNotLike(String value) {
            addCriterion("res_acc_rule not like", value, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleIn(List<String> values) {
            addCriterion("res_acc_rule in", values, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleNotIn(List<String> values) {
            addCriterion("res_acc_rule not in", values, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleBetween(String value1, String value2) {
            addCriterion("res_acc_rule between", value1, value2, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResAccRuleNotBetween(String value1, String value2) {
            addCriterion("res_acc_rule not between", value1, value2, "resAccRule");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdIsNull() {
            addCriterion("res_owner_id is null");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdIsNotNull() {
            addCriterion("res_owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdEqualTo(Long value) {
            addCriterion("res_owner_id =", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdNotEqualTo(Long value) {
            addCriterion("res_owner_id <>", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdGreaterThan(Long value) {
            addCriterion("res_owner_id >", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("res_owner_id >=", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdLessThan(Long value) {
            addCriterion("res_owner_id <", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("res_owner_id <=", value, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdIn(List<Long> values) {
            addCriterion("res_owner_id in", values, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdNotIn(List<Long> values) {
            addCriterion("res_owner_id not in", values, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdBetween(Long value1, Long value2) {
            addCriterion("res_owner_id between", value1, value2, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andResOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("res_owner_id not between", value1, value2, "resOwnerId");
            return (Criteria) this;
        }

        public Criteria andPublicFlagIsNull() {
            addCriterion("public_flag is null");
            return (Criteria) this;
        }

        public Criteria andPublicFlagIsNotNull() {
            addCriterion("public_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPublicFlagEqualTo(Integer value) {
            addCriterion("public_flag =", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagNotEqualTo(Integer value) {
            addCriterion("public_flag <>", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagGreaterThan(Integer value) {
            addCriterion("public_flag >", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_flag >=", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagLessThan(Integer value) {
            addCriterion("public_flag <", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagLessThanOrEqualTo(Integer value) {
            addCriterion("public_flag <=", value, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagIn(List<Integer> values) {
            addCriterion("public_flag in", values, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagNotIn(List<Integer> values) {
            addCriterion("public_flag not in", values, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagBetween(Integer value1, Integer value2) {
            addCriterion("public_flag between", value1, value2, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andPublicFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("public_flag not between", value1, value2, "publicFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagIsNull() {
            addCriterion("connect_flag is null");
            return (Criteria) this;
        }

        public Criteria andConnectFlagIsNotNull() {
            addCriterion("connect_flag is not null");
            return (Criteria) this;
        }

        public Criteria andConnectFlagEqualTo(Integer value) {
            addCriterion("connect_flag =", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagNotEqualTo(Integer value) {
            addCriterion("connect_flag <>", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagGreaterThan(Integer value) {
            addCriterion("connect_flag >", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("connect_flag >=", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagLessThan(Integer value) {
            addCriterion("connect_flag <", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagLessThanOrEqualTo(Integer value) {
            addCriterion("connect_flag <=", value, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagIn(List<Integer> values) {
            addCriterion("connect_flag in", values, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagNotIn(List<Integer> values) {
            addCriterion("connect_flag not in", values, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagBetween(Integer value1, Integer value2) {
            addCriterion("connect_flag between", value1, value2, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andConnectFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("connect_flag not between", value1, value2, "connectFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagIsNull() {
            addCriterion("share_flag is null");
            return (Criteria) this;
        }

        public Criteria andShareFlagIsNotNull() {
            addCriterion("share_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShareFlagEqualTo(Integer value) {
            addCriterion("share_flag =", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotEqualTo(Integer value) {
            addCriterion("share_flag <>", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagGreaterThan(Integer value) {
            addCriterion("share_flag >", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_flag >=", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagLessThan(Integer value) {
            addCriterion("share_flag <", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagLessThanOrEqualTo(Integer value) {
            addCriterion("share_flag <=", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagIn(List<Integer> values) {
            addCriterion("share_flag in", values, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotIn(List<Integer> values) {
            addCriterion("share_flag not in", values, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagBetween(Integer value1, Integer value2) {
            addCriterion("share_flag between", value1, value2, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("share_flag not between", value1, value2, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andPerTimeIsNull() {
            addCriterion("per_time is null");
            return (Criteria) this;
        }

        public Criteria andPerTimeIsNotNull() {
            addCriterion("per_time is not null");
            return (Criteria) this;
        }

        public Criteria andPerTimeEqualTo(Date value) {
            addCriterion("per_time =", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeNotEqualTo(Date value) {
            addCriterion("per_time <>", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeGreaterThan(Date value) {
            addCriterion("per_time >", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("per_time >=", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeLessThan(Date value) {
            addCriterion("per_time <", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeLessThanOrEqualTo(Date value) {
            addCriterion("per_time <=", value, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeIn(List<Date> values) {
            addCriterion("per_time in", values, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeNotIn(List<Date> values) {
            addCriterion("per_time not in", values, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeBetween(Date value1, Date value2) {
            addCriterion("per_time between", value1, value2, "perTime");
            return (Criteria) this;
        }

        public Criteria andPerTimeNotBetween(Date value1, Date value2) {
            addCriterion("per_time not between", value1, value2, "perTime");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}