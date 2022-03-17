#include <stdio.h>

typedef int tam_sayi;
#define ondalikli_sayi float

struct Sayilar {
	
	tam_sayi a;
	tam_sayi b;
	
};

class Matematik{
	
	private:
		struct Sayilar *sayi;
	
	public:
		
		Matematik(const tam_sayi *x, const tam_sayi *y){
		
		
			sayi = new struct Sayilar;
				
			sayi->a = *x;
			sayi->b =*y;
			
		}
		
		~Matematik()
		{
			
			delete sayi;
			
		}
		
		friend class Islemler;

};

class Islemler{
	
	public:
		
		static void topla(const class Matematik *mat1)
		{
			
			printf("%d + %d = %d\n",mat1->sayi->a,mat1->sayi->b,mat1->sayi->a + mat1->sayi->b);
			
		}
		
		static void cikar(const class Matematik *mat1)
		{
			
			printf("%d - %d = %d\n",mat1->sayi->a,mat1->sayi->b,mat1->sayi->a - mat1->sayi->b);
			
		}
		
		static void carp(const class Matematik *mat1)
		{
			
			printf("%d x %d = %d\n",mat1->sayi->a,mat1->sayi->b,mat1->sayi->a * mat1->sayi->b);
			
			
		}
		
		static void bol(const class Matematik *mat1)
		{
			
			printf("%d / %d = %f\n",mat1->sayi->a , mat1->sayi->b,(float)mat1->sayi->a / mat1->sayi->b);
			
		}
		
		static void mod_al(const class Matematik *mat1)
		{
			
			printf("%d = %d (mod %d) ",mat1->sayi->a , mat1->sayi->a % mat1->sayi->b , mat1->sayi->b);
			
		}
	
};

int main(void)
{
	
	tam_sayi *a = new tam_sayi,*b = new tam_sayi;
	printf("Lutfen 2 adet sayi giriniz...\n");
	scanf("%d%d",a,b);
	const class Matematik *mat1= new class Matematik(a,b);
	Islemler::topla(mat1);
	Islemler::cikar(mat1);
	Islemler::carp(mat1);
	Islemler::bol(mat1);
	Islemler::mod_al(mat1);
	
	delete a;
	delete b;
	delete mat1;
	
	return 0;
}
