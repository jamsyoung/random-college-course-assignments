//
//  Card.h
//  Matchismo
//
//  Created by jayoung on 4/20/13.
//  Copyright (c) 2013 jamsyoung. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Card : NSObject

@property (strong, nonatomic) NSString * contents;
@property (nonatomic, getter = isFaceUp) BOOL faceUp;
@property (nonatomic, getter = isUnplayable) BOOL unplayable;

- (int)match:(NSArray *)otherCards;

@end
