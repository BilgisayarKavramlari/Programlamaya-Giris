/*
 * dinamik-char-dizisi.c
 *
 * 2017 Ozmo <erdoganufukcan@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */

#include <stdio.h>
#include <stdlib.h>
char *yaziGirisi(int);
int main()
{
    int yaziUzunlugu;
    printf("Yazının uzunluğunu giriniz: ");
    fscanf(stdin,"%u",&yaziUzunlugu);
    fgetc(stdin);
    char *tut = yaziGirisi(yaziUzunlugu);
    for(int i = 0; i < yaziUzunlugu; i++)
    {
        fprintf(stdout,"%c\n",tut[i]);
    }
    free(tut);
    return 0;
}

char *yaziGirisi(int uzunluk)
{
    char *string = (char *)malloc(sizeof(char)*uzunluk);
    fprintf(stdout,"Yazı giriniz: ");
    fgets(string,uzunluk+1,stdin);
    return string;
}
