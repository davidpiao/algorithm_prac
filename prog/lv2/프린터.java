package prog.lv2;

import java.util.*;

class 프린터 {
    public int solution(int[] priorities, int location) {
        //큐 선언
        List<PrintJob> printer = new ArrayList<PrintJob>();
        for(int i=0; i<priorities.length; i++) {
            printer.add(new PrintJob(i, priorities[i]));
        }

        int turn = 0;
        while(!printer.isEmpty()) {
            //top 꺼내서 max priority가 아니면 끝에 넣기
            PrintJob job = printer.remove(0);
            if(printer.stream().anyMatch(otherJob -> job.priority < otherJob.priority)) {
                printer.add(job);
            }
            else {
                //max priority이면 내가 찾는 job이 맞는지 확인한다
                turn ++;
                if(location == job.location) {
                    break;
                }
            }
        }
        return turn;
    }

    class PrintJob {
        int priority;
        int location;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
}