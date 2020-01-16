package com.dlx.chapter8;

public abstract class Block{

    public abstract void body() throws Exception;

    public Thread doThread(){
        return new Thread(){
            @Override
            public void run() {
                try{
                    body();
                }catch (Throwable e){
                    Block.<RuntimeException>throwAs(e);
                }
            }
        };
    }

    @SuppressWarnings("uncheck")
    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }
}
