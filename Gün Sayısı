#include <stdio.h>
#include <stdlib.h>

int main()
{
    int toplam;
    int k,h,d,a;
    int bugun[3];
    int dogum[3];
    int aydanArtanGun=0;
    int artanYil=0;
    int gunFark=0,ayFark=0,yilFark=0;

            printf("Bugunun gununu giriniz");
            scanf("%d", &bugun[0]);
            if(bugun[0]<=0 || bugun[0]>31)
            {printf("Gunler 1-31 arasi olmak zorundadir..");
            return 0;
            }

            printf("Bugunun ayini giriniz");
            scanf("%d", &bugun[1]);
            if(bugun[1]<=0 || bugun[1]>12)
            {printf("Aylar 1-12 arasi olmak zorundadir..");
            return 0;
            }

            printf("Bugunun yilini giriniz");
            scanf("%d", &bugun[2]);


            printf("Dogum gununu giriniz");
            scanf("%d", &dogum[0]);
            if(dogum[0]<=0 || dogum[0]>31)
            {printf("Gunler 1-31 arasi olmak zorundadir..");
            return 0;
            }

            printf("Dogum ayini giriniz");
            scanf("%d", &dogum[1]);
            if(dogum[1]<=0 || dogum[1]>12)
            {printf("Aylar 1-12 arasi olmak zorundadir..");
            return 0;
            }

            printf("Dogum yilini giriniz");
            scanf("%d", &dogum[2]);


    //Gunlerin hesaplanması
    if(dogum[1]== 2 && dogum[2]%4==1)
       {
            gunFark = 28 - dogum[0];
       }

    else if(dogum[1]== 2 && dogum[2]%4==0)
       {
            gunFark = 29 - dogum[0];
       }
    //else if(dogum[1]==1 || dogum[1]==3 ||dogum[1]==5 ||dogum[1]==7 ||dogum[1]==8 ||dogum[1]==10 ||dogum[1]==12 )
    else if ( (dogum[1]<=7 && dogum[1]%2==1) || (dogum[1]>=8 && dogum[1]%2==0))
        {
             gunFark = 31 - dogum[0];
        }
    //else if(dogum[1]==4 || dogum[1]==6 || dogum[1]==9 ||dogum[1]==11)
    else if((dogum[1]<7 && dogum[1]%2==0 && dogum[1] != 2 )|| (dogum[1]>8 && dogum[1]%2==1))
        {
             gunFark = 30 - dogum[0];
        }

        //Ayların hesaplanması

    for(d=dogum[1]+1;d<=12;d++)
        {
                if(d <= 7)
                {
                    if(d%2==1)
                    {
                    aydanArtanGun++;
                    }
                }

                if(d>=8)
                {
                    if(d%2==0)
                    {
                    aydanArtanGun++;
                    }
                }

        }

             ayFark = ((12-dogum[1])*30)+aydanArtanGun;
            if(dogum[1]==1 && dogum[2]%4==0)
            {

               ayFark= ayFark -1;
            }
            else if(dogum[1]==1 && dogum[2]%4==1)
            {

                 ayFark= ayFark -2;
            }

        //Yılların hesaplanması

    yilFark = ((bugun[2]-1) - (dogum[2]))*365;




    for(k=dogum[2]+1; k < bugun[2]; k++) //Artan yili bulma ( 29 subat )
    {
        if(k%4==0)
        {
               artanYil++;
        }
    }



    yilFark = yilFark + artanYil;


    int aydanArtanGunBugun=0;
    int ayFarkBugun=1,yilFarkBugun=1;

    //Bugunun tarihi ile islem

    for(a=1;a<bugun[1];a++)
    {
        if(a <= 7)
                {
                    if(a%2==1)
                    {
                    aydanArtanGunBugun++;
                    }
                }

        if(a>=8)
                {
                    if(a%2==0)
                    {
                    aydanArtanGunBugun++;
                    }
                }

    }


           ayFarkBugun = ((bugun[1]-1)*30) + aydanArtanGunBugun;
            if(bugun[1]==1 && bugun[2]%4==0)
            {

               ayFarkBugun= ayFarkBugun -1;
            }
            else if(bugun[1]==1 && bugun[2]%4==1)
            {

                 ayFarkBugun= ayFarkBugun -2;
            }



    toplam = gunFark+ayFark+yilFark+ bugun[0]+ ayFarkBugun + 2;

    printf("%d",toplam);





    return 0;
}
