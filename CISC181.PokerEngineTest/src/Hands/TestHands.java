package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFiveOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a five of a kind:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		
	}
	
	
	@Test
	public final void TestFourOfAKind1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be four of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFourOfAKind2(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be four of a kind:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFullHouse1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.SPADES,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestFlush(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraight1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraight2(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a straight:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.SPADES,eRank.SIX));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a three of a kind:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestTwoPair(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.ACE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a two pair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestOnePair(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a one pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestHighCard(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.JACK));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a HighCard:",eHandStrength.HighCard.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestJoker1(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.JACK));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.NINE));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a flush:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestJoker2(){
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.SIX));
		rfHand.add(new Card(eSuit.HEARTS,eRank.SIX));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		rfHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be a Full house:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	

}
