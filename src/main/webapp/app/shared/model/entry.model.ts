import { ITag } from 'app/shared/model//tag.model';

export interface IEntry {
  id?: number;
  title?: string;
  description?: any;
  published?: boolean;
  tags?: ITag[];
  blogTitle?: string;
  blogId?: number;
  categoryName?: string;
  categoryId?: number;
}

export const defaultValue: Readonly<IEntry> = {
  published: false
};
