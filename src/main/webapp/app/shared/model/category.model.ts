import { IEntry } from 'app/shared/model//entry.model';

export interface ICategory {
  id?: number;
  name?: string;
  entries?: IEntry[];
}

export const defaultValue: Readonly<ICategory> = {};
