package ut01.act04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio04 {

	int a, b, c, d, e, f, g, h, i, j, k, l, m, n, �, o, p, q, r, s, t, u, v, w,
			x, y, z = 0;

	public void readTextFile(String path) throws IOException {
		File fichero = new File(path);
		FileReader fr = null;
		// StringBuffer mifichero = new StringBuffer();
		int caracter;
		fr = new FileReader(fichero);
		while ((caracter = fr.read()) != -1) {
			if (caracter == 'a' || caracter == '�' || caracter == 'A'
					|| caracter == '�')
				a++;
			if (caracter == 'a' || caracter == '�' || caracter == 'E'
					|| caracter == '�')
				e++;
			if (caracter == 'i' || caracter == '�' || caracter == 'I'
					|| caracter == '�')
				i++;
			if (caracter == 'o' || caracter == '�' || caracter == 'O'
					|| caracter == '�')
				o++;
			if (caracter == 'u' || caracter == '�' || caracter == 'U'
					|| caracter == '�')
				u++;
			if (caracter == 'b' || caracter == 'B')
				b++;
			if (caracter == 'c' || caracter == 'C')
				c++;
			if (caracter == 'd' || caracter == 'D')
				d++;
			if (caracter == 'f' || caracter == 'F')
				f++;
			if (caracter == 'g' || caracter == 'G')
				g++;
			if (caracter == 'h' || caracter == 'H')
				h++;
			if (caracter == 'j' || caracter == 'J')
				j++;
			if (caracter == 'k' || caracter == 'K')
				k++;
			if (caracter == 'l' || caracter == 'L')
				l++;
			if (caracter == 'm' || caracter == 'M')
				m++;
			if (caracter == 'n' || caracter == 'N')
				n++;
			if (caracter == '�' || caracter == '�')
				�++;
			if (caracter == 'p' || caracter == 'P')
				p++;
			if (caracter == 'q' || caracter == 'Q')
				q++;
			if (caracter == 'r' || caracter == 'R')
				r++;
			if (caracter == 's' || caracter == 'S')
				s++;
			if (caracter == 't' || caracter == 'T')
				t++;
			if (caracter == 'v' || caracter == 'V')
				v++;
			if (caracter == 'w' || caracter == 'W')
				w++;
			if (caracter == 'x' || caracter == 'X')
				x++;
			if (caracter == 'y' || caracter == 'Y')
				y++;
			if (caracter == 'z' || caracter == 'Z')
				z++;
		}
		System.out.println(a);
	}
}
