package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;
import userfuncs.binaryfuncs.BinaryFuncProvider;

public class AbsPlusProvider implements BinaryFuncProvider{

    @Override
    public BinaryFunc get() {
        return new AbsPlus();
    }
}