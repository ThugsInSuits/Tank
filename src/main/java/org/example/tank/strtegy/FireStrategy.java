package org.example.tank.strtegy;

import org.example.tank.PlayTank;
import org.example.tank.TankFrame;

import java.io.Serializable;

/**
 * @author XiZhuangBaoTu
 * Date 2023/5/16 00:41
 * Version 1.0
 * @description
 **/
public interface FireStrategy extends Serializable {
    void fire(PlayTank playTank, TankFrame tf);
}
