package com.caipiao.app.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TabUserBasicInfomationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TabUserBasicInfomationExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andYhdhIsNull() {
            addCriterion("yhdh is null");
            return (Criteria) this;
        }

        public Criteria andYhdhIsNotNull() {
            addCriterion("yhdh is not null");
            return (Criteria) this;
        }

        public Criteria andYhdhEqualTo(String value) {
            addCriterion("yhdh =", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotEqualTo(String value) {
            addCriterion("yhdh <>", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThan(String value) {
            addCriterion("yhdh >", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhGreaterThanOrEqualTo(String value) {
            addCriterion("yhdh >=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThan(String value) {
            addCriterion("yhdh <", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLessThanOrEqualTo(String value) {
            addCriterion("yhdh <=", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhLike(String value) {
            addCriterion("yhdh like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotLike(String value) {
            addCriterion("yhdh not like", value, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhIn(List<String> values) {
            addCriterion("yhdh in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotIn(List<String> values) {
            addCriterion("yhdh not in", values, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhBetween(String value1, String value2) {
            addCriterion("yhdh between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhdhNotBetween(String value1, String value2) {
            addCriterion("yhdh not between", value1, value2, "yhdh");
            return (Criteria) this;
        }

        public Criteria andYhlxIsNull() {
            addCriterion("yhlx is null");
            return (Criteria) this;
        }

        public Criteria andYhlxIsNotNull() {
            addCriterion("yhlx is not null");
            return (Criteria) this;
        }

        public Criteria andYhlxEqualTo(Integer value) {
            addCriterion("yhlx =", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotEqualTo(Integer value) {
            addCriterion("yhlx <>", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxGreaterThan(Integer value) {
            addCriterion("yhlx >", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxGreaterThanOrEqualTo(Integer value) {
            addCriterion("yhlx >=", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxLessThan(Integer value) {
            addCriterion("yhlx <", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxLessThanOrEqualTo(Integer value) {
            addCriterion("yhlx <=", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxIn(List<Integer> values) {
            addCriterion("yhlx in", values, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotIn(List<Integer> values) {
            addCriterion("yhlx not in", values, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxBetween(Integer value1, Integer value2) {
            addCriterion("yhlx between", value1, value2, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotBetween(Integer value1, Integer value2) {
            addCriterion("yhlx not between", value1, value2, "yhlx");
            return (Criteria) this;
        }

        public Criteria andLrrqIsNull() {
            addCriterion("lrrq is null");
            return (Criteria) this;
        }

        public Criteria andLrrqIsNotNull() {
            addCriterion("lrrq is not null");
            return (Criteria) this;
        }

        public Criteria andLrrqEqualTo(Date value) {
            addCriterion("lrrq =", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotEqualTo(Date value) {
            addCriterion("lrrq <>", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThan(Date value) {
            addCriterion("lrrq >", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThanOrEqualTo(Date value) {
            addCriterion("lrrq >=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThan(Date value) {
            addCriterion("lrrq <", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThanOrEqualTo(Date value) {
            addCriterion("lrrq <=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIn(List<Date> values) {
            addCriterion("lrrq in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotIn(List<Date> values) {
            addCriterion("lrrq not in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqBetween(Date value1, Date value2) {
            addCriterion("lrrq between", value1, value2, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotBetween(Date value1, Date value2) {
            addCriterion("lrrq not between", value1, value2, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrryIsNull() {
            addCriterion("lrry is null");
            return (Criteria) this;
        }

        public Criteria andLrryIsNotNull() {
            addCriterion("lrry is not null");
            return (Criteria) this;
        }

        public Criteria andLrryEqualTo(Integer value) {
            addCriterion("lrry =", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotEqualTo(Integer value) {
            addCriterion("lrry <>", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThan(Integer value) {
            addCriterion("lrry >", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryGreaterThanOrEqualTo(Integer value) {
            addCriterion("lrry >=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThan(Integer value) {
            addCriterion("lrry <", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryLessThanOrEqualTo(Integer value) {
            addCriterion("lrry <=", value, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryIn(List<Integer> values) {
            addCriterion("lrry in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotIn(List<Integer> values) {
            addCriterion("lrry not in", values, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryBetween(Integer value1, Integer value2) {
            addCriterion("lrry between", value1, value2, "lrry");
            return (Criteria) this;
        }

        public Criteria andLrryNotBetween(Integer value1, Integer value2) {
            addCriterion("lrry not between", value1, value2, "lrry");
            return (Criteria) this;
        }

        public Criteria andTxurlIsNull() {
            addCriterion("txurl is null");
            return (Criteria) this;
        }

        public Criteria andTxurlIsNotNull() {
            addCriterion("txurl is not null");
            return (Criteria) this;
        }

        public Criteria andTxurlEqualTo(String value) {
            addCriterion("txurl =", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlNotEqualTo(String value) {
            addCriterion("txurl <>", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlGreaterThan(String value) {
            addCriterion("txurl >", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlGreaterThanOrEqualTo(String value) {
            addCriterion("txurl >=", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlLessThan(String value) {
            addCriterion("txurl <", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlLessThanOrEqualTo(String value) {
            addCriterion("txurl <=", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlLike(String value) {
            addCriterion("txurl like", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlNotLike(String value) {
            addCriterion("txurl not like", value, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlIn(List<String> values) {
            addCriterion("txurl in", values, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlNotIn(List<String> values) {
            addCriterion("txurl not in", values, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlBetween(String value1, String value2) {
            addCriterion("txurl between", value1, value2, "txurl");
            return (Criteria) this;
        }

        public Criteria andTxurlNotBetween(String value1, String value2) {
            addCriterion("txurl not between", value1, value2, "txurl");
            return (Criteria) this;
        }

        public Criteria andXgrqIsNull() {
            addCriterion("xgrq is null");
            return (Criteria) this;
        }

        public Criteria andXgrqIsNotNull() {
            addCriterion("xgrq is not null");
            return (Criteria) this;
        }

        public Criteria andXgrqEqualTo(Date value) {
            addCriterion("xgrq =", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotEqualTo(Date value) {
            addCriterion("xgrq <>", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqGreaterThan(Date value) {
            addCriterion("xgrq >", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqGreaterThanOrEqualTo(Date value) {
            addCriterion("xgrq >=", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqLessThan(Date value) {
            addCriterion("xgrq <", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqLessThanOrEqualTo(Date value) {
            addCriterion("xgrq <=", value, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqIn(List<Date> values) {
            addCriterion("xgrq in", values, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotIn(List<Date> values) {
            addCriterion("xgrq not in", values, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqBetween(Date value1, Date value2) {
            addCriterion("xgrq between", value1, value2, "xgrq");
            return (Criteria) this;
        }

        public Criteria andXgrqNotBetween(Date value1, Date value2) {
            addCriterion("xgrq not between", value1, value2, "xgrq");
            return (Criteria) this;
        }

        public Criteria andZzidIsNull() {
            addCriterion("zzid is null");
            return (Criteria) this;
        }

        public Criteria andZzidIsNotNull() {
            addCriterion("zzid is not null");
            return (Criteria) this;
        }

        public Criteria andZzidEqualTo(String value) {
            addCriterion("zzid =", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidNotEqualTo(String value) {
            addCriterion("zzid <>", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidGreaterThan(String value) {
            addCriterion("zzid >", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidGreaterThanOrEqualTo(String value) {
            addCriterion("zzid >=", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidLessThan(String value) {
            addCriterion("zzid <", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidLessThanOrEqualTo(String value) {
            addCriterion("zzid <=", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidLike(String value) {
            addCriterion("zzid like", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidNotLike(String value) {
            addCriterion("zzid not like", value, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidIn(List<String> values) {
            addCriterion("zzid in", values, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidNotIn(List<String> values) {
            addCriterion("zzid not in", values, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidBetween(String value1, String value2) {
            addCriterion("zzid between", value1, value2, "zzid");
            return (Criteria) this;
        }

        public Criteria andZzidNotBetween(String value1, String value2) {
            addCriterion("zzid not between", value1, value2, "zzid");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("yxbz is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("yxbz is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(String value) {
            addCriterion("yxbz =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(String value) {
            addCriterion("yxbz <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(String value) {
            addCriterion("yxbz >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(String value) {
            addCriterion("yxbz >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(String value) {
            addCriterion("yxbz <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(String value) {
            addCriterion("yxbz <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLike(String value) {
            addCriterion("yxbz like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotLike(String value) {
            addCriterion("yxbz not like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<String> values) {
            addCriterion("yxbz in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<String> values) {
            addCriterion("yxbz not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(String value1, String value2) {
            addCriterion("yxbz between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(String value1, String value2) {
            addCriterion("yxbz not between", value1, value2, "yxbz");
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