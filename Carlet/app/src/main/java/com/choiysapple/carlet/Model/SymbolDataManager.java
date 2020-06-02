package com.choiysapple.carlet.Model;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;

public class SymbolDataManager implements Serializable {

    private ArrayList<Symbol> symbols = new ArrayList<Symbol>();

    // Symbols data
    public SymbolDataManager() {
        symbols.add(new Symbol("전면 안개등", "symbol1", "green", "shape", "전면 안개등 이상 발생")); // 1
        symbols.add(new Symbol("파워 스티어링 경고", "symbol2", "red", "shape", "전동 파워 스티어링 시스템 문제 발생"));
        symbols.add(new Symbol("후면 안개등", "symbol3", "yellow", "shape", "후면 안개등 이상 발생"));
        symbols.add(new Symbol("워셔 액 부족", "symbol4", "yellow", "shape", "워셔 액 부족"));
        symbols.add(new Symbol("브레이크 패드 경고", "symbol5", "yellow", "shape", "브레이크 패드 이상 발생 (마모 등)"));
        symbols.add(new Symbol("정속 주행 켜짐", "symbol6", "yellow", "shape", ""));
        symbols.add(new Symbol("방향 지시등", "symbol7", "green", "shape", "방향 지시등 이상 발생"));
        symbols.add(new Symbol("빗방울, 빛 감지", "symbol8", "yellow", "shape", ""));
        symbols.add(new Symbol("동절기 모드", "symbol9", "other", "shape", "외부 온도가 낮으므로 도로 결빙 주의"));
        symbols.add(new Symbol("정보 표시 장치", "symbol10", "other", "shape", "")); // 10
        symbols.add(new Symbol("예열 플러그 / 디젤 예열 경고", "symbol11", "yellow", "shape", "예열 플러그 교체 필요"));
        symbols.add(new Symbol("서리 주의", "symbol12", "other", "shape", ""));
        symbols.add(new Symbol("점화스위치 경고", "symbol13", "red", "shape", "시동을 켜는 장치에 문제 발생"));
        symbols.add(new Symbol("차내 열쇠 없음", "symbol14", "yellow", "shape", "차내 열쇠 없음"));
        symbols.add(new Symbol("전자 열쇠 배터리 부족", "symbol15", "red", "shape", "전자 열쇠 배터리 부족"));
        symbols.add(new Symbol("차간 거리 경보 장치", "symbol16", "red", "shape", "차간 거리가 가까움"));
        symbols.add(new Symbol("클러치 페달 밟기", "symbol17", "red", "shape", ""));
        symbols.add(new Symbol("브레이크 페달 밟기", "symbol18", "green", "shape", ""));
        symbols.add(new Symbol("스티어링 잠금장치", "symbol19", "red", "shape", ""));
        symbols.add(new Symbol("전조등", "symbol20", "other", "shape", "")); // 20
        symbols.add(new Symbol("타이어 압력 부족", "symbol21", "yellow", "shape", "타이어 공기압이 기준치 이하인 상태"));
        symbols.add(new Symbol("차포등 정보", "symbol22", "green", "shape", ""));
        symbols.add(new Symbol("외부 경관등 결함", "symbol23", "yellow", "shape", ""));
        symbols.add(new Symbol("브레이크 등 경보", "symbol24", "red", "shape", ""));
        symbols.add(new Symbol("디젤 배기가스 후처리 장치 경보", "symbol25", "yellow", "shape", ""));
        symbols.add(new Symbol("트레일러 견인장치", "symbol26", "red", "shape", ""));
        symbols.add(new Symbol("공기 현가 장치 경고", "symbol27", "red", "shape", ""));
        symbols.add(new Symbol("차선 이탈", "symbol28", "green", "shape", "차선 이탈"));
        symbols.add(new Symbol("촉매 변환 장치 경고", "symbol29", "red", "shape", "촉매 장치 과열"));
        symbols.add(new Symbol("안전벨트 미착용", "symbol30", "red", "shape", "안전벨트 착용 요망")); // 30
        symbols.add(new Symbol("주차 브레이크 등", "symbol31", "red", "shape", ""));
        symbols.add(new Symbol("배터리 경고", "symbol32", "red", "shape", "배터리 또는 충전 계통에 문제 발생"));
        symbols.add(new Symbol("주차 보조장치", "symbol33", "other", "shape", ""));
        symbols.add(new Symbol("오일교환 등 서비스 요망", "symbol34", "yellow", "shape", ""));
        symbols.add(new Symbol("자동 전조등", "symbol35", "yellow", "shape", ""));
        symbols.add(new Symbol("전조등 범위 조정기", "symbol36", "yellow", "shape", ""));
        symbols.add(new Symbol("후방 스포일러 경고", "symbol37", "red", "shape", ""));
        symbols.add(new Symbol("컨버터블 천장 경고", "symbol38", "red", "shape", ""));
        symbols.add(new Symbol("에어백 경고", "symbol39", "red", "shape", "에어백 시스템에 문제 발생"));
        symbols.add(new Symbol("핸드 브레이크 경고", "symbol40", "red", "shape", "핸드 브레이크 작동 상태에서 주행, 브레이크 오일 부족이나 유압에 문제")); // 40
        symbols.add(new Symbol("연료필터에 물 있음", "symbol41", "red", "shape", "연료필터에 물 있음"));
        symbols.add(new Symbol("에어백 비활성화", "symbol42", "yellow", "shape", ""));
        symbols.add(new Symbol("결합 문제", "symbol43", "yellow", "shape", ""));
        symbols.add(new Symbol("전조등 하향", "symbol44", "green", "shape", ""));
        symbols.add(new Symbol("에어 필터 더러움", "symbol45", "other", "shape", ""));
        symbols.add(new Symbol("경제운전 지시기", "symbol46", "green", "text", ""));
        symbols.add(new Symbol("내리막길 주행 제어 장치", "symbol47", "yellow", "shape", ""));
        symbols.add(new Symbol("온도 주의", "symbol48", "red", "shape", "엔진 과열 주의"));
        symbols.add(new Symbol("ABS 잠김 방지 브레이크 경고", "symbol49", "yellow", "all", "ABS 기능에 문제 발생"));
        symbols.add(new Symbol("연료 필터 주의", "symbol50", "yellow", "shape", "연료 필터에 수분 혼입됨")); // 50
        symbols.add(new Symbol("문 열림", "symbol51", "red", "shape", "문이 제대로 닫히지 않았을 때 경고"));
        symbols.add(new Symbol("보닛 열림", "symbol52", "red", "shape", "보닛이 열렸을 때 경고"));
        symbols.add(new Symbol("연료 부족", "symbol53", "red", "shape", "남은 연료가 기준치 이하"));
        symbols.add(new Symbol("자동기어박스 경고", "symbol54", "red", "shape", ""));
        symbols.add(new Symbol("속도제한기", "symbol55", "other", "shape", ""));
        symbols.add(new Symbol("현가장치 조절", "symbol56", "yellow", "shape", ""));
        symbols.add(new Symbol("유압부족", "symbol57", "red", "shape", "엔진오일 압력 부족"));
        symbols.add(new Symbol("앞유리창 성애제거", "symbol58", "yellow", "shape", ""));
        symbols.add(new Symbol("트렁크 열림", "symbol59", "red", "shape", "트렁크가 열렸을 때 경고"));
        symbols.add(new Symbol("주행 안정 제어 장치 꺼짐", "symbol60", "yellow", "shape", "관련 센서 및 장비에 문제가 생기거나 동작 버튼이 꺼져있는 경우")); // 60
        symbols.add(new Symbol("빗물 감지기", "symbol61", "yellow", "shape", ""));
        symbols.add(new Symbol("엔진 / 배출 경고", "symbol62", "yellow", "shape", "엔진 제어 계통에 문제 발생"));
        symbols.add(new Symbol("뒷유리창 성애 제거", "symbol63", "yellow", "shape", ""));
        symbols.add(new Symbol("자동 와이퍼 작동", "symbol64", "yellow", "all", ""));
    }

    // for Shape search
    public ArrayList<Symbol> getShapeSearchResult(String color, String shape){
        ArrayList<Symbol> result = (ArrayList<Symbol>) symbols.clone();

        int index = 0;
        ArrayList<Integer> target = new ArrayList<Integer>();
        String msg_result = "<Result>\n";

        // find indices od symbol objects not matches to shape & color
        for (Symbol element : symbols){

            // condition check
            if(element.color != color || element.shape != shape) {
                target.add(index);
            }
            index++;
        }

        // delete
        for (Integer i: target){
            Log.d("", String.valueOf(i));
            result.remove(symbols.get(i));
        }

        index = 0;
        for (Symbol element: result){
            msg_result += (Integer.toString(index+1)+") "+element.name + " " + element.description +"\n");
            index++;
        }

        Log.d(color+shape+":", msg_result);
        return result;
    }

    // for search by text
    public ArrayList<Symbol> getTextSearchResult(String keyword){

        ArrayList<Symbol> result = new ArrayList<Symbol>();

        int index = 0;
        ArrayList<Integer> target = new ArrayList<Integer>();
        // return symbols whose name contains keyword
        for (Symbol element : symbols){
            // condition check
            if(element.name.contains(keyword)) {
                target.add(index);
            }
            index++;
        }

        for (Integer i: target){
            result.remove(i);
        }

        Log.d("Text Search Result:", result.toString());
        return  result;
    }

    // return all symbol array data
    public ArrayList<Symbol> getSymbols() {
        Log.d("get Symbols:", symbols.toString());
        return symbols;
    }
}
