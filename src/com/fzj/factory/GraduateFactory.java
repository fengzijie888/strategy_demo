package com.fzj.factory;

public class GraduateFactory implements IFactroy{
    @Override
    public LeiFeng createLeiFeng() {
        return new Graduate();
    }
}
