package com.cici.mvn.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class NaviExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NaviExample() {
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

        public Criteria andNaviIdIsNull() {
            addCriterion("navi_id is null");
            return (Criteria) this;
        }

        public Criteria andNaviIdIsNotNull() {
            addCriterion("navi_id is not null");
            return (Criteria) this;
        }

        public Criteria andNaviIdEqualTo(Integer value) {
            addCriterion("navi_id =", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdNotEqualTo(Integer value) {
            addCriterion("navi_id <>", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdGreaterThan(Integer value) {
            addCriterion("navi_id >", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("navi_id >=", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdLessThan(Integer value) {
            addCriterion("navi_id <", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdLessThanOrEqualTo(Integer value) {
            addCriterion("navi_id <=", value, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdIn(List<Integer> values) {
            addCriterion("navi_id in", values, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdNotIn(List<Integer> values) {
            addCriterion("navi_id not in", values, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdBetween(Integer value1, Integer value2) {
            addCriterion("navi_id between", value1, value2, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviIdNotBetween(Integer value1, Integer value2) {
            addCriterion("navi_id not between", value1, value2, "naviId");
            return (Criteria) this;
        }

        public Criteria andNaviNameIsNull() {
            addCriterion("navi_name is null");
            return (Criteria) this;
        }

        public Criteria andNaviNameIsNotNull() {
            addCriterion("navi_name is not null");
            return (Criteria) this;
        }

        public Criteria andNaviNameEqualTo(String value) {
            addCriterion("navi_name =", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameNotEqualTo(String value) {
            addCriterion("navi_name <>", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameGreaterThan(String value) {
            addCriterion("navi_name >", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameGreaterThanOrEqualTo(String value) {
            addCriterion("navi_name >=", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameLessThan(String value) {
            addCriterion("navi_name <", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameLessThanOrEqualTo(String value) {
            addCriterion("navi_name <=", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameLike(String value) {
            addCriterion("navi_name like", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameNotLike(String value) {
            addCriterion("navi_name not like", value, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameIn(List<String> values) {
            addCriterion("navi_name in", values, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameNotIn(List<String> values) {
            addCriterion("navi_name not in", values, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameBetween(String value1, String value2) {
            addCriterion("navi_name between", value1, value2, "naviName");
            return (Criteria) this;
        }

        public Criteria andNaviNameNotBetween(String value1, String value2) {
            addCriterion("navi_name not between", value1, value2, "naviName");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andGuestIsNull() {
            addCriterion("guest is null");
            return (Criteria) this;
        }

        public Criteria andGuestIsNotNull() {
            addCriterion("guest is not null");
            return (Criteria) this;
        }

        public Criteria andGuestEqualTo(Integer value) {
            addCriterion("guest =", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotEqualTo(Integer value) {
            addCriterion("guest <>", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThan(Integer value) {
            addCriterion("guest >", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThanOrEqualTo(Integer value) {
            addCriterion("guest >=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThan(Integer value) {
            addCriterion("guest <", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThanOrEqualTo(Integer value) {
            addCriterion("guest <=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestIn(List<Integer> values) {
            addCriterion("guest in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotIn(List<Integer> values) {
            addCriterion("guest not in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestBetween(Integer value1, Integer value2) {
            addCriterion("guest between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotBetween(Integer value1, Integer value2) {
            addCriterion("guest not between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviIsNull() {
            addCriterion("is_app_navi is null");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviIsNotNull() {
            addCriterion("is_app_navi is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviEqualTo(Integer value) {
            addCriterion("is_app_navi =", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviNotEqualTo(Integer value) {
            addCriterion("is_app_navi <>", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviGreaterThan(Integer value) {
            addCriterion("is_app_navi >", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_app_navi >=", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviLessThan(Integer value) {
            addCriterion("is_app_navi <", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviLessThanOrEqualTo(Integer value) {
            addCriterion("is_app_navi <=", value, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviIn(List<Integer> values) {
            addCriterion("is_app_navi in", values, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviNotIn(List<Integer> values) {
            addCriterion("is_app_navi not in", values, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviBetween(Integer value1, Integer value2) {
            addCriterion("is_app_navi between", value1, value2, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andIsAppNaviNotBetween(Integer value1, Integer value2) {
            addCriterion("is_app_navi not between", value1, value2, "isAppNavi");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andOrderSortIsNull() {
            addCriterion("order_sort is null");
            return (Criteria) this;
        }

        public Criteria andOrderSortIsNotNull() {
            addCriterion("order_sort is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSortEqualTo(Integer value) {
            addCriterion("order_sort =", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotEqualTo(Integer value) {
            addCriterion("order_sort <>", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortGreaterThan(Integer value) {
            addCriterion("order_sort >", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sort >=", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortLessThan(Integer value) {
            addCriterion("order_sort <", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortLessThanOrEqualTo(Integer value) {
            addCriterion("order_sort <=", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortIn(List<Integer> values) {
            addCriterion("order_sort in", values, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotIn(List<Integer> values) {
            addCriterion("order_sort not in", values, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortBetween(Integer value1, Integer value2) {
            addCriterion("order_sort between", value1, value2, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sort not between", value1, value2, "orderSort");
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