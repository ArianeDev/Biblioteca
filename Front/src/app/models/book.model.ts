export interface Book {
	id: number;
	title: string;
	isbn: string;
	category: string;
	photoURL: string;
	description: string;
	quantity: number;
	evaluation: string;
	author: {
		authorID: number;
	}
}

export interface BookRegister {
	title: string;
	isbn: string;
	category: string;
	photoURL: string;
	description: string;
	quantity: number;
	evaluation: string;
	author: {
		id: number;
	}
}
