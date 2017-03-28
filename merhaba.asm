section .text ; Calistirilacak kodlar kısmı

	global _start ; Baslangic noktasi belirtiyoruz

_start: ; Bolum Kodları

	nop ; Hic bir islem yapma
	mov eax, 4 ;
	mov ebx, 1 ;
	mov ecx, mesaj ;
	mov edx, 11h ;
	int 80h ; kernel

	mov ebx, eax

	xor ebx, ebx
	inc ebx ;

	mov eax, 1;
	int 80h ;

section .data
	mesaj: db "Merhaba Assembly",10 ; Mesaj ve yeni satir karakter
