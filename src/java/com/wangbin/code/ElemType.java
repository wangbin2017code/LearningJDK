package com.wangbin.code;

/**
 * 要素ID.
 * Created by wangbin on 2018/06/02.
 */
public enum ElemType {

    //实时温度
    TMP("TMP"),
    //日最低气温
    TMPDAYMIN08("TMPDAYMIN08"),
    TMPDAYMIN20("TMPDAYMIN20"),
    //日最高气温
    TMPDAYMAX08("TMPDAYMAX08"),
    TMPDAYMAX20("TMPDAYMAX20"),
    //日平均气温
    TMPDAYAVE08("TMPDAYAVE08"),
    TMPDAYAVE20("TMPDAYAVE20"),
    //任意时段最低气温
    TMPANYMIN("TMPANYMIN"),
    //任意时段最高气温
    TMPANYMAX("TMPANYMAX"),
    //任意时段平均气温
    TMPANYAVE("TMPANYAVE"),
    //变温（1、3、24、48、72小时）
    DT1H("DT1H"),
    DT3H("DT3H"),
    DT24H("DT24H"),
    DT48H("DT48H"),
    DT72H("DT72H"),
    //日最高气温变温
    DTDAYMAX08("DTDAYMAX08"),
    DTDAYMAX20("DTDAYMAX20"),
    //日最低气温变温
    DTDAYMIN08("DTDAYMIN08"),
    DTDAYMIN20("DTDAYMIN20"),

    //5分钟雨量
    TP5MIN("TP5MIN"),
    //10分钟雨量
    TP10MIN("TP10MIN"),
    //小时内雨量
    TP1HOUR("TP1HOUR"),
    //逐小时（整点）雨量
    TPHOUR("TPHOUR"),
    //累积降水
    TPCOUNT("TPCOUNT"),

    //1分钟能见度
    VVP1M("VVP1M"),
    //10分钟能见度
    VVP10M("VVP10M"),
    //最小能见度
    VVP1H("VVP1H"),
    //任意时段最小能见度
    VVPANYMIN("VVPANYMIN"),

    //瞬时风速
    EDA("EDA"),
    //2分钟风速
    EDA2MIN("EDA2MIN"),
    //10分钟风速
    EDA10MIN("EDA10MIN"),
    //瞬时最大风速
    EDAMAX("EDAMAX"),
    //10分钟最大风速
    EDA10MINMAX("EDA10MINMAX"),
    //日极大风速
    EDADAYMAX08("EDADAYMAX08"),
    EDADAYMAX20("EDADAYMAX20"),
    //任意时间极大风
    EDAANYMAX("EDAANYMAX");

    private String name;

    private ElemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
