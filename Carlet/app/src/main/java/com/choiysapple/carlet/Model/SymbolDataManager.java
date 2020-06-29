package com.choiysapple.carlet.Model;

import android.util.Log;

import com.choiysapple.carlet.R;

import java.io.Serializable;
import java.util.ArrayList;

public class SymbolDataManager implements Serializable {

    private ArrayList<Symbol> symbols = new ArrayList<Symbol>();

    // Symbols data
    public SymbolDataManager() {
        symbols.add(new Symbol("전면 안개등", R.drawable.symbol1, "green", "shape", "전면 안개등 이상 발생")); // 1
        symbols.add(new Symbol("파워 스티어링 경고", R.drawable.symbol2, "red", "shape", "전동 파워 스티어링 시스템 문제 발생"));
        symbols.add(new Symbol("후면 안개등", R.drawable.symbol3, "yellow", "shape", "후면 안개등 이상 발생"));
        symbols.add(new Symbol("워셔 액 부족", R.drawable.symbol4, "yellow", "shape", "워셔 액 부족"));
        symbols.add(new Symbol("브레이크 패드 경고", R.drawable.symbol5, "yellow", "shape", "브레이크 패드 이상 발생 (마모 등)"));
        symbols.add(new Symbol("정속 주행 켜짐", R.drawable.symbol6, "yellow", "shape", "정속 주행 모드 실행 시 점등"));
        symbols.add(new Symbol("방향 지시등", R.drawable.symbol7, "green", "shape", "방향 지시등 이상 발생"));
        symbols.add(new Symbol("빗방울, 빛 감지", R.drawable.symbol8, "yellow", "shape", "빗방울 또는 자동차 외부의 빛을 감지하는 센서"));
        symbols.add(new Symbol("동절기 모드", R.drawable.symbol9, "other", "shape", "외부 온도가 낮으므로 도로 결빙 주의"));
        symbols.add(new Symbol("정보 표시 장치", R.drawable.symbol10, "other", "shape", "정보 표시 장치")); // 10
        symbols.add(new Symbol("예열 플러그 / 디젤 예열 경고", R.drawable.symbol11, "yellow", "shape", "예열 플러그 교체 필요"));
        symbols.add(new Symbol("서리 주의", R.drawable.symbol12, "other", "shape", "서리 주의 요함"));
        symbols.add(new Symbol("점화스위치 경고", R.drawable.symbol13, "red", "shape", "시동을 켜는 장치에 문제 발생"));
        symbols.add(new Symbol("차내 열쇠 없음", R.drawable.symbol14, "yellow", "shape", "차내 열쇠 없음"));
        symbols.add(new Symbol("전자 열쇠 배터리 부족", R.drawable.symbol15, "red", "shape", "전자 열쇠 배터리 부족"));
        symbols.add(new Symbol("차간 거리 경보 장치", R.drawable.symbol16, "red", "shape", "차간 거리가 가까움"));
        symbols.add(new Symbol("클러치 페달 밟기", R.drawable.symbol17, "red", "shape", "클러치 페달을 밟으라는 신호"));
        symbols.add(new Symbol("브레이크 페달 밟기", R.drawable.symbol18, "green", "shape", "브레이크 페달을 밟으라는 신호"));
        symbols.add(new Symbol("스티어링 잠금장치", R.drawable.symbol19, "red", "shape", "운전대가 잠겨있는 상태임\n시동을 켜면 소등되어야 함\n계속 점등되어있다면\n정비소 방문 요함"));
        symbols.add(new Symbol("전조등", R.drawable.symbol20, "other", "shape", "전조등이 켜져있음")); // 20
        symbols.add(new Symbol("타이어 압력 부족", R.drawable.symbol21, "yellow", "shape", "타이어 공기압이 기준치 이하인 상태"));
        symbols.add(new Symbol("차포등 정보", R.drawable.symbol22, "green", "shape", "차량 내부에 불이 켜져있을 때 점등\n불을 끄고 내리세요"));
        symbols.add(new Symbol("외부 경관등 결함", R.drawable.symbol23, "yellow", "shape", "외부 경관등에 결함이 발생함"));
        symbols.add(new Symbol("브레이크 등 경보", R.drawable.symbol24, "red", "shape", "차량 후면 브레이크 등에 문제 발생 시 점등\n정비소 방문 요함"));
        symbols.add(new Symbol("디젤 배기가스 후처리 장치 경보", R.drawable.symbol25, "yellow", "shape", "매연 필터 장치에 문제 발생 시 점등\n계속 점등 시 정비소 방문 요함"));
        symbols.add(new Symbol("트레일러 견인장치", R.drawable.symbol26, "red", "shape", "트레일러 견인장치가 작동된 차량의\n견인장치 오작동 시 점등\n정비소 방문 요함"));
        symbols.add(new Symbol("공기 현가 장치 경고", R.drawable.symbol27, "red", "shape", "공기 현가 장치에 문제가 생겼을 시 점등\n정비소 방문 요함"));
        symbols.add(new Symbol("차선 이탈", R.drawable.symbol28, "green", "shape", "차선 이탈"));
        symbols.add(new Symbol("촉매 변환 장치 경고", R.drawable.symbol29, "red", "shape", "촉매 장치 과열"));
        symbols.add(new Symbol("안전벨트 미착용", R.drawable.symbol30, "red", "shape", "안전벨트 착용 요망")); // 30
        symbols.add(new Symbol("주차 브레이크 등", R.drawable.symbol31, "red", "shape", "주차 브레이크가 작동중이거나\n브레이크에 결함이 발생 시 점등\n브레이크를 풀어도 점등이 계속될 시\n정비소 방문 요함"));
        symbols.add(new Symbol("배터리 경고", R.drawable.symbol32, "red", "shape", "배터리 또는 충전 계통에 문제 발생"));
        symbols.add(new Symbol("주차 보조장치", R.drawable.symbol33, "other", "shape", "주변에 사물이 있음.\n충돌에 주의하세요"));
        symbols.add(new Symbol("오일교환 요망", R.drawable.symbol34, "yellow", "shape", "오일 교환이 필요할 시에 점등"));
        symbols.add(new Symbol("자동 전조등", R.drawable.symbol35, "yellow", "shape", "자동 전조등 작동시 점등"));
        symbols.add(new Symbol("전조등 범위 조정기", R.drawable.symbol36, "yellow", "shape", "전조등 범위 조정기 작동시 점등\n점조등을 비추는 각도를 조정할 수 있음"));
        symbols.add(new Symbol("후방 스포일러 경고", R.drawable.symbol37, "red", "shape", "스포일러 작동 오류시 점등 \n 정비소 방문 요함"));
        symbols.add(new Symbol("컨버터블 천장 경고", R.drawable.symbol38, "red", "shape", "컨버터블 작동 관련 경고등\n 계속 점등 시 정비소 방문 요함"));
        symbols.add(new Symbol("에어백 경고", R.drawable.symbol39, "red", "shape", "에어백 시스템에 문제 발생"));
        symbols.add(new Symbol("핸드 브레이크 경고", R.drawable.symbol40, "red", "shape", "핸드 브레이크 작동 상태에서 주행, 브레이크 오일 부족이나 유압에 문제")); // 40
        symbols.add(new Symbol("연료필터에 물 있음", R.drawable.symbol41, "red", "shape", "연료필터에 물 있음"));
        symbols.add(new Symbol("에어백 비활성화", R.drawable.symbol42, "yellow", "shape", "에어백이 비활성화 되어있음\n정비소 방문 요함"));
        symbols.add(new Symbol("결합 문제", R.drawable.symbol43, "yellow", "shape", "어딘가에 결함이 발생함\n정비소 방문 요함"));
        symbols.add(new Symbol("전조등 하향", R.drawable.symbol44, "green", "shape", "전조등이 아래를 보게했을 시 점등"));
        symbols.add(new Symbol("에어 필터 더러움", R.drawable.symbol45, "other", "shape", "에어 필터 청소 필요"));
        symbols.add(new Symbol("경제운전 지시기", R.drawable.symbol46, "green", "text", "경제 운전 지시기"));
        symbols.add(new Symbol("내리막길 주행 제어 장치", R.drawable.symbol47, "yellow", "shape", "내리막길에서 안전하게 내려올 수 있도록 도와주는 장치"));
        symbols.add(new Symbol("온도 주의", R.drawable.symbol48, "red", "shape", "엔진 과열 주의"));
        symbols.add(new Symbol("ABS 잠김 방지 브레이크 경고", R.drawable.symbol49, "yellow", "other", "ABS 기능에 문제 발생"));
        symbols.add(new Symbol("연료 필터 주의", R.drawable.symbol50, "yellow", "shape", "연료 필터에 수분 혼입됨")); // 50
        symbols.add(new Symbol("문 열림", R.drawable.symbol51, "red", "shape", "문이 제대로 닫히지 않았을 때 경고"));
        symbols.add(new Symbol("보닛 열림", R.drawable.symbol52, "red", "shape", "보닛이 열렸을 때 경고"));
        symbols.add(new Symbol("연료 부족", R.drawable.symbol53, "red", "shape", "남은 연료가 기준치 이하"));
        symbols.add(new Symbol("자동기어박스 경고", R.drawable.symbol54, "red", "shape", "변속기 문제 발생 시 점등 \n 정비소 방문 요함"));
        symbols.add(new Symbol("속도제한기", R.drawable.symbol55, "other", "shape", "속도 제한기 작동 시 점등"));
        symbols.add(new Symbol("현가장치 조절", R.drawable.symbol56, "yellow", "shape", "서스펜션 현가장치 조절기에 문제 발생 시 점등\n운행에 큰 문제는 업으나 점등 시\n반드시 정비소 방문 요함"));
        symbols.add(new Symbol("유압부족", R.drawable.symbol57, "red", "shape", "엔진오일 압력 부족"));
        symbols.add(new Symbol("앞유리창 성애제거", R.drawable.symbol58, "yellow", "shape", "앞유리 성에를 제거하는 장치 실행 중"));
        symbols.add(new Symbol("트렁크 열림", R.drawable.symbol59, "red", "shape", "트렁크가 열렸을 때 경고"));
        symbols.add(new Symbol("주행 안정 제어 장치 꺼짐", R.drawable.symbol60, "yellow", "shape", "관련 센서 및 장비에 문제가 생기거나 동작 버튼이 꺼져있는 경우")); // 60
        symbols.add(new Symbol("빗물 감지기", R.drawable.symbol61, "yellow", "shape", "우천이 감지되었을 때 작동"));
        symbols.add(new Symbol("엔진 / 배출 경고", R.drawable.symbol62, "yellow", "shape", "엔진 제어 계통에 문제 발생"));
        symbols.add(new Symbol("뒷유리창 성애 제거", R.drawable.symbol63, "yellow", "shape", "뒷 유리에 열선을 켜는 장치 실행 중"));
        symbols.add(new Symbol("자동 와이퍼 작동", R.drawable.symbol64, "yellow", "other", "자동 와이퍼 동작 시 점등"));
    }


    /*
    Model functions
    */

    // for Shape search
    public ArrayList<Symbol> getShapeSearchResult(String color, String shape){
        ArrayList<Symbol> result = (ArrayList<Symbol>) symbols.clone();

        int index = 0;
        Boolean isColorAll = false, isShapeAll = false;
        ArrayList<Integer> target = new ArrayList<Integer>();
        String msg_result = "<getShapeSearchResult>\n";

        // check color or shape parameter is all, this will be used to following loop
        if (color == "all")
            isColorAll = true;
        if (shape == "all")
            isShapeAll = true;

        // find indices od symbol objects not matches to shape & color
        for (Symbol element : symbols){

            // condition check, skip loop when all option detected
            if(element.color != color && !isColorAll) {
                target.add(index);
            }
            else if(element.shape != shape && !isShapeAll) {
                target.add(index);
            }
            index++;
        }
//        Log.d("Non matching symbols", target.toString());

        // delete
        for (Integer i: target){
            Log.d("", String.valueOf(i));
            result.remove(symbols.get(i));
        }

        // log
//        index = 0;
//        for (Symbol element: result){
//            msg_result += (Integer.toString(index+1)+") "+element.name + " / " + element.description +"\n");
//            index++;
//        }

        Log.d("\n"+color+shape+":", msg_result);

        return result;
    }



    // for search by text
    public ArrayList<Symbol> getTextSearchResult(String keyword){
        ArrayList<Symbol> result = (ArrayList<Symbol>) symbols.clone();
        
        int index = 0;
        ArrayList<Integer> target = new ArrayList<Integer>();
        // return symbols whose name contains keyword
        for (Symbol element : symbols){
            // condition check
            if(!element.name.contains(keyword)) {
                target.add(index);
            }else{
                Log.d("getTextSearchResult", element.name.toString());
            }
            index++;
        }

        Log.d("getTextSearchResult", target.toString());
        for (Integer i: target){
            result.remove(symbols.get(i));
        }

        Log.d("getTextSearchResult", result.toString());
        return  result;
    }

    // return all symbol array data
    public ArrayList<Symbol> getSymbols() {
        Log.d("get Symbols:", symbols.toString());
        return symbols;
    }
}
