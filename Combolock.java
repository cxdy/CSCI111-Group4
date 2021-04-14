public class Combolock

{

    int dial1,dial2,dial3;

    int Dial = 0;

    int number1,number2,number3;

    int count = 0;

    public Combolock( int dial1, int dial2, int dial3 ){

        this.dial1 = dial1;

        this.dial2 = dial2;

        this.dial3 = dial3;

    }

    public void reset(){


        this.Dial = 0;

        this.number1 = 0;

        this.number2 = 0;

        this.number3 = 0;

    }

    public void turnClockwise( int ticks )

    {

        if (count == 0)

        {

            int tempdial = this.Dial + ticks;

            if (tempdial> 40)

            {

                this.Dial = tempdial-40;

            }

            else

                this.Dial = tempdial;

            number1 = this.Dial;

        }

        if (count == 2)

        {

            int tempdial = this.Dial + ticks;

            if (tempdial > 40)

            {

                this.Dial = tempdial-40;

            }

            else

                this.Dial = tempdial;

            number3 = this.Dial;

        }

    }

    public void turnCounterClockwise( int ticks )

    {

        if (count == 1)

        {

            int tempdial = this.Dial - ticks;

            if (tempdial < 0)

            {

                this.Dial = 40+tempdial;

            }

            else

                this.Dial = tempdial;

        }

        number2 = this.Dial;

    }

    public boolean open()

    {

        if(number1==dial1){

            if(number2==dial2)

                if(number3==dial3)

                    return true;

                else

                    count=2;

            else

                count=1;

        }

        else

            count=0;

        return false;

    }

}