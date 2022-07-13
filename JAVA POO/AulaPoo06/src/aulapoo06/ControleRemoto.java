    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package aulapoo06;

    /**
     *
     * @author Usuário
     */
    public class ControleRemoto implements Controlador {
        //ATRIBUTOS
        private int volume=0;
        private boolean ligado, tocando;

        //metodo construtor
        public ControleRemoto() {
            this.setVolume(50);
            this.setLigado(false);
        }

    //metodos especiais
        private int getVolume() {
            return volume;
        }

        private void setVolume(int volume) {
            this.volume = volume;
        }

        private boolean getLigado() {
            return ligado;
        }

        private void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        private boolean getTocando() {
            return tocando;
        }

        private void setTocando(boolean tocando) {
            this.tocando = tocando;
        }

        //metodos abstratos
        @Override
        public void ligar() {
            setLigado(true);
            System.out.println("Aparelho Ligado");
        }

        @Override
        public void desligar() {
            setLigado(false);
            System.out.println("Aparelho Desligado");

        }

        @Override
        public void abrirMenu() {
            if(getLigado()==true){
                System.out.println("Está tocando?: "+this.getTocando());
                System.out.print("volume: "+this.getVolume()+" ");
                for(int i=1;i<=getVolume();i+=10){
                    System.out.print("|");
                }
                System.out.println(" ");
            }


        }

        @Override
        public void fecharMenu() {
            System.out.println("Fechando Menu...");

        }

        @Override
        public void volMais() {
            if(getLigado()==true){
               setVolume(getVolume()+5); 
            }
            else{
                System.out.println("impossivel aumentar o volume");
            }

        }

        @Override
        public void volMenos() {
            if(getLigado()==true){
                setVolume(getVolume() - 5);
            }

        }

        @Override
        public void ligarMudo() {
            if(getLigado()==true){
                setVolume(0);
            }

        }

        @Override
        public void dsligarMudo() {
            if(getLigado()==true){
                setVolume(50);

            }

        }

        @Override
        public void play() {
            if(getLigado()==true && getTocando()==false){
                setTocando(true);
            }

        }

        @Override
        public void pause() {
            if(getLigado()==true && getTocando()==true){
                setTocando(false);
            }

        }






    }
