package com.cursoandroid.retfofitsimpleimpl.controller;

import android.graphics.Bitmap;
import android.os.AsyncTask;


//<Input param of doInBackground, Input param of onProgressUpdate, Value of output of doInBackground and Value of input of onPostExecute >
//Just accept class of input, not accept primitive types
public class TaskManager extends AsyncTask<String, String, Bitmap> {

    @Override
    protected void onPreExecute() {
        //Se encontra na UIThread, preparando se para entrar em outra thread
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        //Acesso a thread secundária, com tarefa asincrona
        return null;
    }

    @Override
    protected void onProgressUpdate(String... params) {
        //Permite que fique atualizando durante a execução do doInBackground
    }

    @Override
    protected void onPostExecute(Bitmap params) {
        //Retorna a UIThread
    }
}
