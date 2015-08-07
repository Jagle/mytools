package android.support.v4.app; class FragmentState { void a() { int a;
a=0;// .class final Landroid/support/v4/app/FragmentState;
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
a=0;// .field final a:Ljava/lang/String;
a=0;// 
a=0;// .field final b:I
a=0;// 
a=0;// .field final c:Z
a=0;// 
a=0;// .field final d:I
a=0;// 
a=0;// .field final e:I
a=0;// 
a=0;// .field final f:Ljava/lang/String;
a=0;// 
a=0;// .field final g:Z
a=0;// 
a=0;// .field final h:Z
a=0;// 
a=0;// .field final i:Landroid/os/Bundle;
a=0;// 
a=0;// .field j:Landroid/os/Bundle;
a=0;// 
a=0;// .field k:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/app/v;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/v;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/v;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/v;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->b:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->c:Z
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->d:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->e:I
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->g:Z
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentState;->h:Z
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->b:I
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->p:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->c:Z
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->x:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->d:I
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->y:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->e:I
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->z:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->C:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->g:Z
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->B:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->h:Z
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
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
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->e:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->h:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
