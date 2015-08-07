package android.support.v4.app; class BackStackState { void a() { int a;
a=0;// .class final Landroid/support/v4/app/BackStackState;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final a:[I
a=0;// 
a=0;// .field final b:I
a=0;// 
a=0;// .field final c:I
a=0;// 
a=0;// .field final d:Ljava/lang/String;
a=0;// 
a=0;// .field final e:I
a=0;// 
a=0;// .field final f:I
a=0;// 
a=0;// .field final g:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final h:I
a=0;// 
a=0;// .field final i:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final j:Ljava/util/ArrayList;
a=0;// 
a=0;// .field final k:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/i;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/i;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/i;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/i;);
a=0;//     sput-object v0, Landroid/support/v4/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->b:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->c:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->e:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->f:I
a=0;// 
a=0;//     sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->g:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->h:I
a=0;// 
a=0;//     sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->i:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/c;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/g;);
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v1, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     iget v1, p1, Landroid/support/v4/app/c;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v1, v1, 0x7
a=0;// 
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Not on back stack"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/g;);
a=0;//     move v0, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v4, v5, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aput v4, v1, v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v4, v2, 0x1
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     aput v0, v1, v2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v1, v4, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, v5, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     aput v2, v0, v4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     iget v4, v5, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     aput v4, v0, v1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     iget v4, v5, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     aput v4, v0, v2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     iget v4, v5, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     aput v4, v0, v1
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     aput v6, v0, v2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     if-ge v2, v6, :cond_4
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     iget-object v0, v5, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aput v0, v7, v1
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Reference,[I);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Integer);v6=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, v5, Landroid/support/v4/app/g;->a:Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/g;);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aput v3, v1, v2
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->b:I
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/c;->j:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->c:I
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->e:I
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/c;->p:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->f:I
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->g:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/c;->r:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->h:I
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->i:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/support/v4/app/q;)Landroid/support/v4/app/c;
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v6, Landroid/support/v4/app/c;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/support/v4/app/c;);
a=0;//     invoke-direct {v6, p1}, Landroid/support/v4/app/c;-><init>(Landroid/support/v4/app/q;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/c;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_4
a=0;// 
a=0;//     new-instance v7, Landroid/support/v4/app/g;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/support/v4/app/g;);
a=0;//     invoke-direct {v7}, Landroid/support/v4/app/g;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/g;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v0, v3, v0
a=0;// 
a=0;//     iput v0, v7, Landroid/support/v4/app/g;->c:I
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Instantiate "
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " op #"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " base fragment #"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     aget v3, v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v0, v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v0, v7, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v0, v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Landroid/support/v4/app/g;->e:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v3, v4, 0x1
a=0;// 
a=0;//     aget v0, v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Landroid/support/v4/app/g;->f:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     aget v0, v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Landroid/support/v4/app/g;->g:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget v0, v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Landroid/support/v4/app/g;->h:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v3, v5, 0x1
a=0;// 
a=0;//     aget v8, v0, v5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, v7, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     if-ge v4, v8, :cond_3
a=0;// 
a=0;//     sget-boolean v0, Landroid/support/v4/app/q;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Instantiate "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, " set remove fragment #"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     aget v5, v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/q;->f:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v9, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v9=(Reference,[I);
a=0;//     add-int/lit8 v5, v3, 0x1
a=0;// 
a=0;//     aget v3, v9, v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v3, v7, Landroid/support/v4/app/g;->i:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, v7, Landroid/support/v4/app/g;->d:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v5=(Integer);v8=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/g;)V
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->b:I
a=0;// 
a=0;//     iput v0, v6, Landroid/support/v4/app/c;->i:I
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->c:I
a=0;// 
a=0;//     iput v0, v6, Landroid/support/v4/app/c;->j:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v6, Landroid/support/v4/app/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v6, Landroid/support/v4/app/c;->o:I
a=0;// 
a=0;//     iput-boolean v10, v6, Landroid/support/v4/app/c;->k:Z
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->f:I
a=0;// 
a=0;//     iput v0, v6, Landroid/support/v4/app/c;->p:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->g:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v0, v6, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v6, Landroid/support/v4/app/c;->r:I
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->i:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v0, v6, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, v6, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v0, v6, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v10}, Landroid/support/v4/app/c;->a(I)V
a=0;// 
a=0;//     return-object v6
a=0;// .end method
a=0;// 
a=0;// .method public final describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->a:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->c:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->f:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->g:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->i:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->j:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->k:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
