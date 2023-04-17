package com.hr.service;

import com.hr.model.Position;
import com.hr.model.Worker;

public class PromotionService {

    public void jobPromotion(Worker worker, boolean goal) throws Exception {
        Position positionCurrent = worker.getData().getPosition();

        if (Position.manager == positionCurrent) {
            throw new Exception();
        }

        if (goal) {
            Position newPosition = positionCurrent.getNextPosition();
            worker.jobPromotion(newPosition);
        } else {
            throw new Exception();
        }
    }
}
