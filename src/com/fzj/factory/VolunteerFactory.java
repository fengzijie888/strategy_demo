package com.fzj.factory;

public class VolunteerFactory implements IFactroy{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
